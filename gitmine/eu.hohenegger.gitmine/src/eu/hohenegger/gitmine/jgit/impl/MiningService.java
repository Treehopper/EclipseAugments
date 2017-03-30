/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.gitmine.jgit.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;

import eu.hohenegger.gitmine.IMiningService;

public class MiningService implements IMiningService {
	private static final long MILLISECONDS_IN_A_DAY = 86_400_000;
	private static final String HEAD_REF = "HEAD";

	@Override
	public Map<PersonIdent, List<RevCommit>> scanAuthors(Repository repository) throws IOException {
		HashMap<PersonIdent, List<RevCommit>> result = new HashMap<>();

		try (RevWalk revwalk = new RevWalk(repository);) {
			ObjectId HEAD = repository.resolve(HEAD_REF);
			revwalk.markStart(revwalk.parseCommit(HEAD));
			Iterator<RevCommit> it = revwalk.iterator();
			while (it.hasNext()) {
				RevCommit commit = it.next();
				if (!result.containsKey(commit.getAuthorIdent())) {
					List<RevCommit> list = new ArrayList<>();
					list.add(commit);
					result.put(commit.getAuthorIdent(), list);
				} else {
					result.get(commit.getAuthorIdent()).add(commit);
				}
			}
		}

		return result;
	}

	@Override
	public List<Integer> scanCommitsPerDay(Repository repository)
			throws IOException {
		Map<Long, List<RevCommit>> result = new TreeMap<>();

		try (RevWalk revwalk = new RevWalk(repository);) {
			ObjectId HEAD;
			HEAD = repository.resolve(HEAD_REF);
			revwalk.markStart(revwalk.parseCommit(HEAD));
			Iterator<RevCommit> it = revwalk.iterator();
			Long dayDate = 0l;
			while (it.hasNext()) {
				RevCommit commit = it.next();

				Long currentCommitDay = getCommitDay(commit);
				//			List<Date> daysInBetween = getDaysInBetween(dayDate, currentCommitDay);
				//			for (Date dayInBetween : daysInBetween) {
				//				result.put(dayInBetween.getTime(), new ArrayList<RevCommit>());
				//			}
				dayDate = currentCommitDay;
				if (!result.containsKey(dayDate)) {
					List<RevCommit> list = new ArrayList<>();
					list.add(commit);
					result.put(dayDate, list);
				} else {
					result.get(dayDate).add(commit);
				}

			}

			Long firstDay = result.keySet().iterator().next();
			List<Integer> result2 = new ArrayList<>();
			for (long i = firstDay + MILLISECONDS_IN_A_DAY; i < new Date().getTime(); i += MILLISECONDS_IN_A_DAY) {
				if (result.containsKey(i)) {
					result2.add(result.get(i).size());
				} else {
					result2.add(0);
				}
			}

			//		Set<Long> keySet = result.keySet();
			//		dayDate = 0l;
			//		List<Long> result2 = new ArrayList<>();
			//		for (Long currentCommitDay : keySet) {
			//			List<Date> daysInBetween = getDaysInBetween(dayDate, currentCommitDay);
			//			for (Date dayInBetween : daysInBetween) {
			//				result2.add(dayInBetween.getTime());
			//			}
			//			dayDate = currentCommitDay;
			//		}
			//		for (Long long1 : result2) {
			// result.put(long1, new ArrayList<RevCommit>());
			//		}

			return result2;
		}

	}

	public static List<Date> getDaysInBetween(Long firstDay, Long lastDay) {
		if (firstDay.equals(0l)) {
			return Collections.emptyList();
		}
		System.out.println(lastDay - firstDay);
		List<Date> result = new ArrayList<>();
		for (long i = firstDay + MILLISECONDS_IN_A_DAY; i < lastDay; i += MILLISECONDS_IN_A_DAY) {
			result.add(new Date(i));
		}
		return result;
	}

	//	private void fillGap(Map<Long, List<RevCommit>> result, Long previousDay,
	//			Long nextDay) {
	//		int daysSinceLastCommit = (int) ((nextDay - previousDay) / MILLISECONDS_IN_A_DAY);
	//		for (int i = 1; i < daysSinceLastCommit; i++) {
	//			result.put(Long.valueOf(previousDay + i*MILLISECONDS_IN_A_DAY), new ArrayList<RevCommit>());
	//		}
	//	}

	private Long getCommitDay(RevCommit commit) {
		long commitTime = getCommitTimeInMilliseconds(commit);
		Date dayDate = getDayDate(new Date(commitTime));

		Long key = Long.valueOf(dayDate.getTime());
		return key;
	}

	private long getCommitTimeInMilliseconds(RevCommit commit) {
		return ((long) commit.getCommitTime()) * 1000;
	}

	private Date getDayDate(Date preciseDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(preciseDate);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);

		cal.set(year, month, day, 0, 0, 0);
		return cal.getTime();
	}

}
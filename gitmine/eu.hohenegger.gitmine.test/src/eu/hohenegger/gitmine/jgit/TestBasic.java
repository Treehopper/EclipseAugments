/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.gitmine.jgit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.api.errors.UnmergedPathsException;
import org.eclipse.jgit.errors.AmbiguousObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.RevisionSyntaxException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryCache;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.hohenegger.gitmine.IMiningService;
import eu.hohenegger.gitmine.jgit.impl.MiningService;

public class TestBasic {

	private static final String HEAD_REF = "HEAD";
	private static final String NO_EXTENSION = "";
	private static final String TMP_REPO_PREFIX = "GitRepo";
	private Git git;
	private IMiningService miner;

	@Before
	public void init() throws IOException, GitAPIException {
		File localPath = File.createTempFile(TMP_REPO_PREFIX, NO_EXTENSION);
		localPath.delete();

		git = Git.init().setDirectory(localPath).setBare(false).call();

		commit(new PersonIdent("alice", "alice@acme.com"));
		commit(new PersonIdent("bo", "bob@acme.com"));

		miner = new MiningService();
	}

	@Test
	public void testScan() throws RevisionSyntaxException, AmbiguousObjectException, IncorrectObjectTypeException, IOException {
		Map<PersonIdent, List<RevCommit>> authorToCommits = miner.scanAuthors(git.getRepository());
		assertTrue(!authorToCommits.isEmpty());

	}

	Date createDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();

		cal.set(year, month, day, 0, 0, 0);
		return cal.getTime();
	}

	@Test
	public void testDaysInBetween() {
		Date firstDay = createDate(2014, Calendar.JANUARY, 1);
		Date lastDay = createDate(2014, Calendar.FEBRUARY, 1);
		List<Date> daysInBetween = MiningService.getDaysInBetween(firstDay.getTime(), lastDay.getTime());
		assertEquals(30, daysInBetween.size());
		for (Date date : daysInBetween) {
			assertTrue(date.compareTo(firstDay) > 0);
			assertTrue(date.compareTo(lastDay) < 0);
		}
	}

	public void commit(PersonIdent author) throws IOException, JGitInternalException,
	UnmergedPathsException, GitAPIException {
		String commitMessage = "Added myfile";

		git.commit().setMessage(commitMessage).setAuthor(author).call();

		try (Repository repository = git.getRepository();) {
			try (RevWalk revwalk = new RevWalk(repository);) {
				ObjectId HEAD = repository.resolve(HEAD_REF);
				revwalk.markStart(revwalk.parseCommit(HEAD));

				revwalk.dispose();
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		RepositoryCache.clear();
		git.getRepository().close();
	}
}
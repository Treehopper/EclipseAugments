/*******************************************************************************
 * Copyright (c) 2019 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.m2e.jandexconnector.core;

import java.util.Set;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;

public class BuildParticipant extends MojoExecutionBuildParticipant {

	public static final String JANDEX = "jandex";

	public BuildParticipant(MojoExecution execution) {
		super(execution, true);
	}

	@Override
	public Set<IProject> build(final int kind, final IProgressMonitor monitor) throws Exception {
		MojoExecution execution = getMojoExecution();

		if (execution == null) {
			return null;
		}
		if (!JANDEX.equals(execution.getGoal())) {
			return null;
		}
		return super.build(kind, monitor);
	}
}

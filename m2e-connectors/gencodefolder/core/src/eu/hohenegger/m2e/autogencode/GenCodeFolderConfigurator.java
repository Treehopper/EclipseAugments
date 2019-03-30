package eu.hohenegger.m2e.autogencode;

import java.io.File;
import java.util.Arrays;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.jdt.AbstractSourcesGenerationProjectConfigurator;

public class GenCodeFolderConfigurator extends AbstractSourcesGenerationProjectConfigurator {

	private static final String GENERATED_CODE_FOLDERS = "target/generated-sources/java";

	@Override
	protected File[] getSourceFolders(ProjectConfigurationRequest request, MojoExecution mojoExecution,
			IProgressMonitor monitor) throws CoreException {
		return Arrays.stream(GENERATED_CODE_FOLDERS.split(","))
				.map(p -> new File(request.getMavenProject().getBuild().getDirectory(), p))
				.filter(f -> f.exists())
				.toArray(size -> new File[size]);
	}

}

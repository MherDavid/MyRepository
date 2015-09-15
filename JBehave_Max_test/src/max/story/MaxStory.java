package max.story;

import java.util.List;


import max.step.MaxStep;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterControls;



public class MaxStory extends JUnitStory {	
	@Override
	public Configuration configuration() {
		   
		return new MostUsefulConfiguration()
		//Example annotation configure
		.useParameterControls(new ParameterControls().useDelimiterNamedParameters(true))
		//.useParameterControls(new ParameterControls().useNameDelimiterLeft("[").useNameDelimiterRight("]"))
				// where to find the stories
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				// CONSOLE and TXT reporting
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT))
									//Pending
									.usePendingStepStrategy(new FailingUponPendingStep());
									
										
	}

	// Here we specify the steps classes
	@Override
	public List<CandidateSteps> candidateSteps() {
		// varargs, can have more that one steps classes
		return new InstanceStepsFactory(configuration(), new MaxStep())
				.createCandidateSteps();
	}
}

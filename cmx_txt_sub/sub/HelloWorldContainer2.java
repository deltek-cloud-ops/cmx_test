package hello.world;

import hello.world.datamodels.HelloWorldCardDataModel;

import com.maconomy.api.container.launcher.MiContainerEvents;
import com.maconomy.api.container.launcher.MiContainerFactory;
import com.maconomy.toolkit.containers.McAbstractRootContainer;
import com.maconomy.toolkit.containers.McContainerConfiguration;
import com.maconomy.toolkit.containers.MiContainerConfiguration;

public class HelloWorldContainer extends McAbstractRootContainer implements
		MiContainerEvents {
	private HelloWorldContainer(final MiContainerFactory.MiResources resources) {
		super(resources);
	}

	@Override
	protected MiContainerConfiguration.MiRoot defineConfiguration() {
		final MiContainerConfiguration.MiRoot configuration = McContainerConfiguration.McRoot
				.filterWithCard(HelloWorldCardDataModel.FACTORY);
		return configuration;
	}

	public static final class McFactory implements MiContainerFactory {
		/** {@inheritDoc} */
		@Override
		public MiContainerEvents createContainer(
				final MiContainerFactory.MiResources resources) {
			return new HelloWorldContainer(resources);
		}
	}
}
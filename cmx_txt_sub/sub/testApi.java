	@Override
	protected MiContainerConfiguration.MiRoot defineConfiguration() {
		final MiContainerConfiguration.MiRoot configuration = McContainerConfiguration.McRoot
				.filterWithCard(HelloWorldCardDataModel.FACTORY);
		return configuration;
	}
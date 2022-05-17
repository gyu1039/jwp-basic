package next.support.context;


//@WebListener
//public class ContextLoaderListener implements ServletContextListener {
//
//    private static final Logger log = LoggerFactory.getLogger(ContextLoaderListener.class);
//
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//        populator.addScript(new ClassPathResource("jwp.sql"));
//        DatabasePopulatorUtils.execute(populator, ConnectionManager.getDataSource());
//
//        log.info("Completed Load ServletContext");
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//
//    }
//}

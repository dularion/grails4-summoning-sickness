package grails4_summ_sick


class LoggingInterceptor {

  LoggingInterceptor() {
    matchAll()
  }

  boolean before() {
    log.info("Request START: ${new Date()}")
    return true
  }

  boolean after() {
    log.info("Request AFTER: ${new Date()}")
    return true
  }

}

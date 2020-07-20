

import groovy.json.JsonSlurper


String jobName = System.getenv('JOB_NAME')

def call(){

     def request = libraryResource 'lib.json'
     

     def InputJSON = new JsonSlurper().parseText(request)

    println "jobName"

    println(InputJSON['Name']) 






}

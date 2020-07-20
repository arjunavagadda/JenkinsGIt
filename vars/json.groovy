

import groovy.json.JsonSlurper




def call(${env.JOB_NAME}){

     def request = libraryResource 'lib.json'
     

     def InputJSON = new JsonSlurper().parseText(request)

    println "${env.JOB_NAME}"

    println(InputJSON['Name']) 






}

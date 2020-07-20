

import groovy.json.JsonSlurper




def call(){
     
     
     
     nick = "${BUILD_NUMBER}"
     
     job = "${JOB_NAME}"

     def request = libraryResource 'lib.json'
     

     def InputJSON = new JsonSlurper().parseText(request)
     
     println nick

   

    println(InputJSON['Name']) 






}

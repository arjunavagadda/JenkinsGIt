import groovy.json.JsonSlurper



def call(){
     
     job = "${JOB_NAME}"


     def request = libraryResource 'lib.json'

     def InputJSON = new JsonSlurper().parseText(request)

      println job

     // result = InputJSON.job.Name
     
     // println result

     

}

import groovy.json.JsonSlurper

job = "${JOB_NAME}"

def call(job){


     def request = libraryResource 'lib.json'

     def InputJSON = new JsonSlurper().parseText(request)

     // println job

     // result = InputJSON.job.Name
     
     // println result

     

}

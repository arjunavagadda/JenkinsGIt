import groovy.json.JsonSlurper



def call(){
     
     job = "${JOB_NAME}"


     def request = libraryResource 'lib.json'

     def InputJSON = new JsonSlurper().parseText(request)

     jobres = job.toString()
     
     result = InputJSON.jobres.Name
     
     println result

     

}

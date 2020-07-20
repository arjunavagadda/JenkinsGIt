import groovy.json.JsonSlurper



def call(){
     
     job = "${JOB_NAME}"


     def request = libraryResource 'lib.json'

     def InputJSON = new JsonSlurper().parseText(request)
     
     println job.getClass() 

     jobres = job.toString()
     
     println jobres
     
     println jobres.getClass()
     
     result = InputJSON.jobres.Name
     
     println result

     

}

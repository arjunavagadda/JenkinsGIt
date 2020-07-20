import groovy.json.JsonSlurper



def call(){
     
     job = "${JOB_NAME}"


     def request = libraryResource 'lib.json'

     def InputJSON = new JsonSlurper().parseText(request)
     
     println "jenkins job name" + job.getClass() 
     
     jobres = "${job}".toString()

    
     
     println "Converted to string" + jobres
     
     println jobres.getClass()
     
     res = InputJSON.Person.Age
     
      println "result without jenkins" + res
     
     result = InputJSON.jobres.Age
     
   
     
     println "req" + result

     

}



import groovy.json.JsonSlurper


def call(){

     def request = libraryResource 'Person.json'
     println "${request}"

     def InputJSON = new JsonSlurper().parseText(request)

     

     InputJSON.each { k, v ->
  println k
}


}

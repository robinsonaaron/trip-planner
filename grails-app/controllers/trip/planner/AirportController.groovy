package trip.planner
import grails.converters.*


class AirportController {
        def scaffold = true;

        def getXml = {
                render Airport.findByIata(params.iata) as XML
        }  

        def getJson = {
                def airport = Airport.findByIata(params.iata)
  
                if(!airport){
                        airport = new Airport(iata:params.iata, name:"Not found")
                }
  
                render airport as JSON
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ST10389095;

/**
 *
 * @author lab_services_student
 */
public class Response 
{
    String response = "It will all be worth it";
    
    public String returnResponse()
    {
          
            return response;
    
    }
    
    public int calculateNumResponses(int initialResponseCount, int newResponse)
    {
        
        int totalresponse = initialResponseCount + newResponse;
        
        return totalresponse;
        
    }
}

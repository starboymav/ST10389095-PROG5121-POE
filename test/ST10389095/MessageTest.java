package ST10389095;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author lab_services_student
 */
public class MessageTest 
{
    Message message = new Message();
    
    public MessageTest() {
    }

    @Test
    public void testgetMessage() 
    {
        String expected ="One Day";
        String actual = message.getMessage();
        
        assertEquals(expected,actual);
    }
    
}

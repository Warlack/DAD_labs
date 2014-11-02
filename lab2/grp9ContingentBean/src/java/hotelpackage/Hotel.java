/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelpackage;

/**
 *
 * @author Kevin
 */

import javax.ejb.Remote;

@Remote
public interface Hotel {
    public void requestContingent(String city, String date, String type);
    
    
}

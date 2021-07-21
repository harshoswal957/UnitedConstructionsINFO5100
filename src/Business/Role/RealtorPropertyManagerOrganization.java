/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.role.RealtorPropertyManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Harsh
 */
public class RealtorPropertyManagerOrganization extends Organization {

    public RealtorPropertyManagerOrganization() {
        super(Organization.Type.RealtorPropertyManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RealtorPropertyManagerRole());
        return roles;
    }
}

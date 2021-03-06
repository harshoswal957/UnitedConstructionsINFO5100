/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.UnitedConstructionEnterprise;
import business.enterprise.Enterprise;
import business.organization.LayoutOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ArchitectRole.ArchitectWorkAreaManagementJPanel;

/**
 *
 * @author Harsh
 */
public class ArchitectRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ArchitectWorkAreaManagementJPanel(userProcessContainer, account, (LayoutOrganization) organization, (UnitedConstructionEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Architect"; //To change body of generated methods, choose Tools | Templates.
    }
}

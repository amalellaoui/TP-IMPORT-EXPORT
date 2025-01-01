package Main;

import Controller.EmployeeController;
import Controller.HolidayController;
import Controller.LoginController;
import DAO.EmployeeDAOImpl;
import DAO.HolidayDAOImpl;
import DAO.LoginDAOImpl;
import Model.Employee;
import Model.EmployeeModel;
import Model.HolidayModel;
import Model.LoginModel;
import View.EmployeeView;
import View.HolidayView;
import View.LoginView;
import View.PanelsView;

public class Main {

    public static void main(String[] args) {
  
        LoginController loginController = new LoginController(new LoginModel(new LoginDAOImpl()), LoginView.getInstance());
      
        
    }
}
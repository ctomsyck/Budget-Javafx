/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetsoftware;

import java.text.NumberFormat;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author CTomsyck
 */
public class BudgetSoftware extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        Label lbMonthlyIncome = new Label();
        lbMonthlyIncome.setText("Monthly Income");
        lbMonthlyIncome.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 33));

        pane.add(lbMonthlyIncome, 0, 0);
        //pane.add(new Label("Monthly Income"), 0, 0);
        pane.add(new Label("Your monthly Take home pay"), 0, 1);
        TextField tfMonthlyTakeHomePay = new TextField();
        tfMonthlyTakeHomePay.setAlignment(Pos.BASELINE_RIGHT);
        tfMonthlyTakeHomePay.setText("0");
        pane.add(tfMonthlyTakeHomePay, 1, 1);
        pane.add(new Label("Spouse's monthly take home pay"), 2, 1);
        TextField tfSpouseTakeHomePay = new TextField();
        tfSpouseTakeHomePay.setAlignment(Pos.BASELINE_RIGHT);
        tfSpouseTakeHomePay.setText("0");
        pane.add(tfSpouseTakeHomePay, 3, 1);
        pane.add(new Label("Other monthly income"), 0, 2);
        TextField tfOtherIncome = new TextField();
        tfOtherIncome.setAlignment(Pos.BASELINE_RIGHT);
        tfOtherIncome.setText("0");
        pane.add(tfOtherIncome, 1, 2);
        pane.add(new Label("Total monthly income"), 0, 3);
        TextField tfMonthlyIncome = new TextField();
        tfMonthlyIncome.setAlignment(Pos.BASELINE_RIGHT);
        tfMonthlyIncome.setText("0");
        pane.add(tfMonthlyIncome, 1, 3);

        Label lbMonthlyExpenses = new Label();
        lbMonthlyExpenses.setText("Monthly Expenses");
        lbMonthlyExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 25));

        pane.add(lbMonthlyExpenses, 0, 4);
        //pane.add(new Label("Monthly Expenses"), 0, 4);

        Label lbHomeExpenses = new Label();
        lbHomeExpenses.setText("Home Expenses");
        lbHomeExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));

        pane.add(lbHomeExpenses, 0, 5);
        //pane.add(new Label("Home Expenses"), 0, 5);
        pane.add(new Label("Rent"), 0, 6);
        TextField tfRent = new TextField();
        tfRent.setAlignment(Pos.BASELINE_RIGHT);
        tfRent.setText("0");
        pane.add(tfRent, 1, 6);
        pane.add(new Label("Mortgage"), 2, 6);
        TextField tfMortgage = new TextField();
        tfMortgage.setAlignment(Pos.BASELINE_RIGHT);
        tfMortgage.setText("0");
        pane.add(tfMortgage, 3, 6);
        pane.add(new Label("Second Mortgage"), 0, 7);
        TextField tfMortgage2 = new TextField();
        tfMortgage2.setAlignment(Pos.BASELINE_RIGHT);
        tfMortgage2.setText("0");
        pane.add(tfMortgage2, 1, 7);
        pane.add(new Label("Homeowner's fees"), 2, 7);
        TextField tfHomeOwnerFee = new TextField();
        tfHomeOwnerFee.setAlignment(Pos.BASELINE_RIGHT);
        tfHomeOwnerFee.setText("0");
        pane.add(tfHomeOwnerFee, 3, 7);
        pane.add(new Label("Home and Renter's insurance"), 0, 8);
        TextField tfHomeRentInsurance = new TextField();
        tfHomeRentInsurance.setAlignment(Pos.BASELINE_RIGHT);
        tfHomeRentInsurance.setText("0");
        pane.add(tfHomeRentInsurance, 1, 8);
        pane.add(new Label("Property Taxes"), 2, 8);
        TextField tfPropertyTaxes = new TextField();
        tfPropertyTaxes.setAlignment(Pos.BASELINE_RIGHT);
        tfPropertyTaxes.setText("0");
        pane.add(tfPropertyTaxes, 3, 8);
        pane.add(new Label("Home Maintenance"), 0, 9);
        TextField tfMaintenance = new TextField();
        tfMaintenance.setAlignment(Pos.BASELINE_RIGHT);
        tfMaintenance.setText("0");
        pane.add(tfMaintenance, 1, 9);
        pane.add(new Label("Electric"), 2, 9);
        TextField tfElectric = new TextField();
        tfElectric.setAlignment(Pos.BASELINE_RIGHT);
        tfElectric.setText("0");
        pane.add(tfElectric, 3, 9);
        pane.add(new Label("Gas"), 0, 10);
        TextField tfGas = new TextField();
        tfGas.setAlignment(Pos.BASELINE_RIGHT);
        tfGas.setText("0");
        pane.add(tfGas, 1, 10);
        pane.add(new Label("Water and sewer"), 2, 10);
        TextField tfWater = new TextField();
        tfWater.setAlignment(Pos.BASELINE_RIGHT);
        tfWater.setText("0");
        pane.add(tfWater, 3, 10);
        pane.add(new Label("Telephone and Cell"), 0, 11);
        TextField tfTelephone = new TextField();
        tfTelephone.setAlignment(Pos.BASELINE_RIGHT);
        tfTelephone.setText("0");
        pane.add(tfTelephone, 1, 11);
        pane.add(new Label("Cable TV"), 2, 11);
        TextField tfCable = new TextField();
        tfCable.setAlignment(Pos.BASELINE_RIGHT);
        tfCable.setText("0");
        pane.add(tfCable, 3, 11);
        pane.add(new Label("Internet"), 0, 12);
        TextField tfInternet = new TextField();
        tfInternet.setAlignment(Pos.BASELINE_RIGHT);
        tfInternet.setText("0");
        pane.add(tfInternet, 1, 12);

        Label lbTransportationExpenses = new Label();
        lbTransportationExpenses.setText("Transportation Expenses");
        lbTransportationExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));

        pane.add(lbTransportationExpenses, 0, 13);
        //pane.add(new Label("Transportation Expenses"), 0, 13);
        pane.add(new Label("Car Payment 1"), 0, 14);
        TextField tfCar1 = new TextField();
        tfCar1.setAlignment(Pos.BASELINE_RIGHT);
        tfCar1.setText("0");
        pane.add(tfCar1, 1, 14);
        pane.add(new Label("Car Payment 2"), 2, 14);
        TextField tfCar2 = new TextField();
        tfCar2.setAlignment(Pos.BASELINE_RIGHT);
        tfCar2.setText("0");
        pane.add(tfCar2, 3, 14);
        pane.add(new Label("Car Insurance monthly"), 0, 15);
        TextField tfCarInsurance = new TextField();
        tfCarInsurance.setAlignment(Pos.BASELINE_RIGHT);
        tfCarInsurance.setText("0");
        pane.add(tfCarInsurance, 1, 15);
        pane.add(new Label("Gasoline"), 2, 15);
        TextField tfCarGas = new TextField();
        tfCarGas.setAlignment(Pos.BASELINE_RIGHT);
        tfCarGas.setText("0");
        pane.add(tfCarGas, 3, 15);
        pane.add(new Label("Car Maintenance"), 0, 16);
        TextField tfCarMaintenance = new TextField();
        tfCarMaintenance.setAlignment(Pos.BASELINE_RIGHT);
        tfCarMaintenance.setText("0");
        pane.add(tfCarMaintenance, 1, 16);
        pane.add(new Label("Parking/Tolls"), 2, 16);
        TextField tfParking = new TextField();
        tfParking.setAlignment(Pos.BASELINE_RIGHT);
        tfParking.setText("0");
        pane.add(tfParking, 3, 16);
        pane.add(new Label("Mass Transit"), 0, 17);
        TextField tfMassTransit = new TextField();
        tfMassTransit.setAlignment(Pos.BASELINE_RIGHT);
        tfMassTransit.setText("0");
        pane.add(tfMassTransit, 1, 17);

        Label lbPersonalExpenses = new Label();
        lbPersonalExpenses.setText("Personal Expenses");
        lbPersonalExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));

        pane.add(lbPersonalExpenses, 0, 18);
        //pane.add(new Label("Personal"), 0, 18);
        pane.add(new Label("Groceries"), 0, 19);
        TextField tfGroceries = new TextField();
        tfGroceries.setAlignment(Pos.BASELINE_RIGHT);
        tfGroceries.setText("0");
        pane.add(tfGroceries, 1, 19);
        pane.add(new Label("Clothing"), 2, 19);
        TextField tfClothing = new TextField();
        tfClothing.setAlignment(Pos.BASELINE_RIGHT);
        tfClothing.setText("0");
        pane.add(tfClothing, 3, 19);
        pane.add(new Label("Dining Out"), 0, 20);
        TextField tfDiningOut = new TextField();
        tfDiningOut.setAlignment(Pos.BASELINE_RIGHT);
        tfDiningOut.setText("0");
        pane.add(tfDiningOut, 1, 20);
        pane.add(new Label("School Lunches"), 2, 20);
        TextField tfSchoolLunches = new TextField();
        tfSchoolLunches.setAlignment(Pos.BASELINE_RIGHT);
        tfSchoolLunches.setText("0");
        pane.add(tfSchoolLunches, 3, 20);
        pane.add(new Label("Beauty and Barbershop"), 0, 21);
        TextField tfBeauty = new TextField();
        tfBeauty.setAlignment(Pos.BASELINE_RIGHT);
        tfBeauty.setText("0");
        pane.add(tfBeauty, 1, 21);
        pane.add(new Label("Dry Cleaning/Laundry"), 2, 21);
        TextField tfDryCleaning = new TextField();
        tfDryCleaning.setAlignment(Pos.BASELINE_RIGHT);
        tfDryCleaning.setText("0");
        pane.add(tfDryCleaning, 3, 21);
        pane.add(new Label("Alcohol/Cigarettes"), 0, 22);
        TextField tfAlcohol = new TextField();
        tfAlcohol.setAlignment(Pos.BASELINE_RIGHT);
        tfAlcohol.setText("0");
        pane.add(tfAlcohol, 1, 22);
        pane.add(new Label("Newspaper/Magazines/Books"), 2, 22);
        TextField tfNewspaper = new TextField();
        tfNewspaper.setAlignment(Pos.BASELINE_RIGHT);
        tfNewspaper.setText("0");
        pane.add(tfNewspaper, 3, 22);

        Label lbHealthExpenses = new Label();
        lbHealthExpenses.setText("Health/Education Expenses");
        lbHealthExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));

        pane.add(lbHealthExpenses, 0, 23);
        //pane.add(new Label("Health and Education Expenses"), 0, 23);
        pane.add(new Label("Health Insurance"), 0, 24);
        TextField tfHealthInsurance = new TextField();
        tfHealthInsurance.setAlignment(Pos.BASELINE_RIGHT);
        tfHealthInsurance.setText("0");
        pane.add(tfHealthInsurance, 1, 24);
        pane.add(new Label("Perscriptions"), 2, 24);
        TextField tfPerscriptions = new TextField();
        tfPerscriptions.setAlignment(Pos.BASELINE_RIGHT);
        tfPerscriptions.setText("0");
        pane.add(tfPerscriptions, 3, 24);
        pane.add(new Label("Life Insurance"), 0, 25);
        TextField tfLifeInsurance = new TextField();
        tfLifeInsurance.setAlignment(Pos.BASELINE_RIGHT);
        tfLifeInsurance.setText("0");
        pane.add(tfLifeInsurance, 1, 25);
        pane.add(new Label("School Supplies"), 2, 25);
        TextField tfSchoolSupplies = new TextField();
        tfSchoolSupplies.setAlignment(Pos.BASELINE_RIGHT);
        tfSchoolSupplies.setText("0");
        pane.add(tfSchoolSupplies, 3, 25);
        pane.add(new Label("Tuition"), 0, 26);
        TextField tfTuition = new TextField();
        tfTuition.setAlignment(Pos.BASELINE_RIGHT);
        tfTuition.setText("0");
        pane.add(tfTuition, 1, 26);
        pane.add(new Label("Student Loans"), 2, 26);
        TextField tfStudentLoans = new TextField();
        tfStudentLoans.setAlignment(Pos.BASELINE_RIGHT);
        tfStudentLoans.setText("0");
        pane.add(tfStudentLoans, 3, 26);
        pane.add(new Label("Child Care"), 0, 27);
        TextField tfChildCare = new TextField();
        tfChildCare.setAlignment(Pos.BASELINE_RIGHT);
        tfChildCare.setText("0");
        pane.add(tfChildCare, 1, 27);
        pane.add(new Label("Child Support"), 2, 27);
        TextField tfChildSupport = new TextField();
        tfChildSupport.setAlignment(Pos.BASELINE_RIGHT);
        tfChildSupport.setText("0");
        pane.add(tfChildSupport, 3, 27);

        Label lbTravelExpenses = new Label();
        lbTravelExpenses.setText("Travel and Gift Expenses");
        lbTravelExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));

        pane.add(lbTravelExpenses, 0, 28);
        //pane.add(new Label("Travel/Gifts"), 0, 28);
        pane.add(new Label("Vacation"), 0, 29);
        TextField tfVacation = new TextField();
        tfVacation.setAlignment(Pos.BASELINE_RIGHT);
        tfVacation.setText("0");
        pane.add(tfVacation, 1, 29);
        pane.add(new Label("Souvenirs"), 2, 29);
        TextField tfSouvenirs = new TextField();
        tfSouvenirs.setAlignment(Pos.BASELINE_RIGHT);
        tfSouvenirs.setText("0");
        pane.add(tfSouvenirs, 3, 29);
        pane.add(new Label("Gifts"), 0, 30);
        TextField tfGifts = new TextField();
        tfGifts.setAlignment(Pos.BASELINE_RIGHT);
        tfGifts.setText("0");
        pane.add(tfGifts, 1, 30);
        pane.add(new Label("Other"), 2, 30);
        TextField tfOther = new TextField();
        tfOther.setAlignment(Pos.BASELINE_RIGHT);
        tfOther.setText("0");
        pane.add(tfOther, 3, 30);

        Label lbOtherExpenses = new Label();
        lbOtherExpenses.setText("Other Expenses");
        lbOtherExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));

        pane.add(lbOtherExpenses, 0, 31);
        //pane.add(new Label("Other Expenses"), 0, 31);
        pane.add(new Label("Charity"), 0, 32);
        TextField tfCharity = new TextField();
        tfCharity.setAlignment(Pos.BASELINE_RIGHT);
        tfCharity.setText("0");
        pane.add(tfCharity, 1, 32);
        pane.add(new Label("Sports"), 2, 32);
        TextField tfSports = new TextField();
        tfSports.setAlignment(Pos.BASELINE_RIGHT);
        tfSports.setText("0");
        pane.add(tfSports, 3, 32);
        pane.add(new Label("Hobbies"), 0, 33);
        TextField tfHobbies = new TextField();
        tfHobbies.setAlignment(Pos.BASELINE_RIGHT);
        tfHobbies.setText("0");
        pane.add(tfHobbies, 1, 33);
        pane.add(new Label("Pet Care"), 2, 33);
        TextField tfPetCare = new TextField();
        tfPetCare.setAlignment(Pos.BASELINE_RIGHT);
        tfPetCare.setText("0");
        pane.add(tfPetCare, 3, 33);
        pane.add(new Label("Monthly Credit Card"), 0, 34);
        TextField tfMonthlyCredit = new TextField();
        tfMonthlyCredit.setAlignment(Pos.BASELINE_RIGHT);
        tfMonthlyCredit.setText("0");
        pane.add(tfMonthlyCredit, 1, 34);
        pane.add(new Label("Other Expenses"), 2, 34);
        TextField tfOtherExpenses = new TextField();
        tfOtherExpenses.setAlignment(Pos.BASELINE_RIGHT);
        tfOtherExpenses.setText("0");
        pane.add(tfOtherExpenses, 3, 34);

        Label lbMonthlySurplusExpenses = new Label();
        lbMonthlySurplusExpenses.setText("Surplus or Deficit");
        lbMonthlySurplusExpenses.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 33));

        pane.add(lbMonthlySurplusExpenses, 0, 35);
        //pane.add(new Label("Monthly Surplus or Deficit"), 0, 35);
        pane.add(new Label("Total Monthly Income"), 0, 36);
        TextField tfTotalMonthlyIncome = new TextField();
        tfTotalMonthlyIncome.setAlignment(Pos.BASELINE_RIGHT);
        tfTotalMonthlyIncome.setText("0");
        pane.add(tfTotalMonthlyIncome, 1, 36);
        pane.add(new Label("Total Monthly Expenses"), 0, 37);
        TextField tfTotalMonthlyExpenses = new TextField();
        tfTotalMonthlyExpenses.setAlignment(Pos.BASELINE_RIGHT);
        tfTotalMonthlyExpenses.setText("0");
        pane.add(tfTotalMonthlyExpenses, 1, 37);
        pane.add(new Label("Monthly Surplus/Deficit"), 0, 38);
        TextField tfMonthlySurplus = new TextField();
        tfMonthlySurplus.setAlignment(Pos.BASELINE_RIGHT);
        tfMonthlySurplus.setText("0");
        pane.add(tfMonthlySurplus, 1, 38);

        Button btnTotals = new Button();
        btnTotals.setText("Calculate Budget");
        pane.add(btnTotals, 3, 45);
        
        //Percentages
        Label lbPercentages = new Label();
        lbPercentages.setText("Percentages");
        lbPercentages.setFont(Font.font(STYLESHEET_MODENA, FontWeight.THIN, 20));
        pane.add(lbPercentages, 0, 39);
        
        pane.add(new Label("Home Expenses %"), 0, 40);
        TextField tfHomePercent = new TextField();
        tfHomePercent.setAlignment(Pos.BASELINE_RIGHT);
        tfHomePercent.setText("0");
        pane.add(tfHomePercent, 1, 40);

        pane.add(new Label("Transportation Expenses %"), 0, 41);
        TextField tfTransportationPercent = new TextField();
        tfTransportationPercent.setAlignment(Pos.BASELINE_RIGHT);
        tfTransportationPercent.setText("0");
        pane.add(tfTransportationPercent, 1, 41);
        
        pane.add(new Label("Personal Expenses %"), 0, 42);
        TextField tfPersonalPercent = new TextField();
        tfPersonalPercent.setAlignment(Pos.BASELINE_RIGHT);
        tfPersonalPercent.setText("0");
        pane.add(tfPersonalPercent, 1, 42);
        
        pane.add(new Label("Health/Education Expenses %"), 0, 43);
        TextField tfHealthPercent = new TextField();
        tfHealthPercent.setAlignment(Pos.BASELINE_RIGHT);
        tfHealthPercent.setText("0");
        pane.add(tfHealthPercent, 1, 43);
        
        pane.add(new Label("Travel and Gift Expenses %"), 0, 44);
        TextField tfTravelPercent = new TextField();
        tfTravelPercent.setAlignment(Pos.BASELINE_RIGHT);
        tfTravelPercent.setText("0");
        pane.add(tfTravelPercent, 1, 44);
        
        pane.add(new Label("Other Expenses %"), 0, 45);
        TextField tfOtherPercent = new TextField();
        tfOtherPercent.setAlignment(Pos.BASELINE_RIGHT);
        tfOtherPercent.setText("0");
        pane.add(tfOtherPercent, 1, 45);

        btnTotals.setOnAction(e -> {
            

            //income
            double takeHome = Double.parseDouble(tfMonthlyTakeHomePay.getText());
            double spouseTakeHome = Double.parseDouble(tfSpouseTakeHomePay.getText());
            double otherIncome = Double.parseDouble(tfOtherIncome.getText());
            double monthlyIncome = takeHome + spouseTakeHome + otherIncome;

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String incomeValue = formatter.format(monthlyIncome);
            tfMonthlyIncome.setText(incomeValue);
            tfTotalMonthlyIncome.setText(incomeValue);

            //expenses
            //home expenses
            double rent = Double.parseDouble(tfRent.getText());
            double mortgage = Double.parseDouble(tfMortgage.getText());
            double mortgage2 = Double.parseDouble(tfMortgage2.getText());
            double homeOwnerFee = Double.parseDouble(tfHomeOwnerFee.getText());
            double homeRentInsurance = Double.parseDouble(tfHomeRentInsurance.getText());
            double propertyTaxes = Double.parseDouble(tfPropertyTaxes.getText());
            double maintenance = Double.parseDouble(tfMaintenance.getText());
            double electric = Double.parseDouble(tfElectric.getText());
            double gas = Double.parseDouble(tfGas.getText());
            double water = Double.parseDouble(tfWater.getText());
            double telephone = Double.parseDouble(tfTelephone.getText());
            double cable = Double.parseDouble(tfCable.getText());
            double internet = Double.parseDouble(tfInternet.getText());

            double homeExpenses = rent + mortgage + mortgage2 + homeOwnerFee + homeRentInsurance + propertyTaxes
                    + maintenance + electric + gas + water + telephone + cable + internet;

            //Transportation Expenses
            double car1 = Double.parseDouble(tfCar1.getText());
            double car2 = Double.parseDouble(tfCar2.getText());
            double carInsurance = Double.parseDouble(tfCarInsurance.getText());
            double carGas = Double.parseDouble(tfCarGas.getText());
            double carMaintenance = Double.parseDouble(tfCarMaintenance.getText());
            double parking = Double.parseDouble(tfParking.getText());
            double massTransit = Double.parseDouble(tfMassTransit.getText());

            double transportationExpenses = car1 + car2 + carInsurance + carGas + carMaintenance
                    + parking + massTransit;

            //Personal Expenses
            double groceries = Double.parseDouble(tfGroceries.getText());
            double clothing = Double.parseDouble(tfClothing.getText());
            double diningOut = Double.parseDouble(tfDiningOut.getText());
            double schoolLunches = Double.parseDouble(tfSchoolLunches.getText());
            double beauty = Double.parseDouble(tfBeauty.getText());
            double dryCleaning = Double.parseDouble(tfDryCleaning.getText());
            double alcohol = Double.parseDouble(tfAlcohol.getText());
            double newspaper = Double.parseDouble(tfNewspaper.getText());

            double personalExpenses = groceries + clothing + diningOut + schoolLunches + beauty
                    + dryCleaning + alcohol + newspaper;

            //Health and Education Expenses
            double healthInsurance = Double.parseDouble(tfHealthInsurance.getText());
            double perscriptions = Double.parseDouble(tfPerscriptions.getText());
            double lifeInsurance = Double.parseDouble(tfLifeInsurance.getText());
            double schoolSupplies = Double.parseDouble(tfSchoolSupplies.getText());
            double tuition = Double.parseDouble(tfTuition.getText());
            double studentLoans = Double.parseDouble(tfStudentLoans.getText());
            double childCare = Double.parseDouble(tfChildCare.getText());
            double childSupport = Double.parseDouble(tfChildSupport.getText());

            double healthEducationExpenses = healthInsurance + perscriptions + lifeInsurance + schoolSupplies
                    + tuition + studentLoans + childCare + childSupport;

            //Travel and Gifts Expenses
            double vacation = Double.parseDouble(tfVacation.getText());
            double souvenirs = Double.parseDouble(tfSouvenirs.getText());
            double gifts = Double.parseDouble(tfGifts.getText());
            double other = Double.parseDouble(tfOther.getText());

            double travelExpenses = vacation + souvenirs + gifts + other;

            //Other Expenses
            double charity = Double.parseDouble(tfCharity.getText());
            double sports = Double.parseDouble(tfSports.getText());
            double hobbies = Double.parseDouble(tfHobbies.getText());
            double petCare = Double.parseDouble(tfPetCare.getText());
            double monthlyCredit = Double.parseDouble(tfMonthlyCredit.getText());
            double otherExp = Double.parseDouble(tfOtherExpenses.getText());

            double otherExpenses = charity + sports + hobbies + petCare + monthlyCredit + otherExp;

            //Total Monthly Expenses
            double totalMonthlyExpenses = homeExpenses + transportationExpenses + personalExpenses + 
                    healthEducationExpenses + travelExpenses + otherExpenses;

            String expenseValue = formatter.format(totalMonthlyExpenses);
            tfTotalMonthlyExpenses.setText(expenseValue);

            double surplusDeficit = monthlyIncome - totalMonthlyExpenses;

            String surplusValue = formatter.format(surplusDeficit);
            tfMonthlySurplus.setText(surplusValue);
            
            
            double homePercent = (homeExpenses / totalMonthlyExpenses) * 100;
            int ihomePercent = (int)homePercent;
            tfHomePercent.setText(ihomePercent + "%");
            
            double transportationPercent = (transportationExpenses / totalMonthlyExpenses) * 100;
            int itransportationPercent = (int)transportationPercent;
            tfTransportationPercent.setText(itransportationPercent + "%");
            
            double personalPercent = (personalExpenses / totalMonthlyExpenses) * 100;
            int ipersonalPercent = (int)personalPercent;
            tfPersonalPercent.setText(ipersonalPercent + "%");
            
            double healthPercent = (healthEducationExpenses / totalMonthlyExpenses) * 100;
            int ihealthPercent = (int)healthPercent;
            tfHealthPercent.setText(ihealthPercent + "%");
            
            double travelPercent = (travelExpenses / totalMonthlyExpenses) * 100;
            int itravelPercent = (int)travelPercent;
            tfTravelPercent.setText(itravelPercent + "%");
            
            double otherPercent = (otherExpenses / totalMonthlyExpenses) * 100;
            int iotherPercent = (int)otherPercent;
            tfOtherPercent.setText(iotherPercent + "%");

        });

        //styling
        
        
        
        //Setting up the scene        
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(pane);
        Scene scene = new Scene(scrollPane, 775, 600);

        primaryStage.setTitle("Budget");
        primaryStage.setScene(scene);


        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

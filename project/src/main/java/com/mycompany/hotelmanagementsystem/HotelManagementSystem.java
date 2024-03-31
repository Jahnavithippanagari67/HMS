/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hotelmanagementsystem;
import HotelManagementSystem.Employee;
import HotelManagementSystem.EmployeesController;
import HotelManagementSystem.GuestsController;
import HotelManagementSystem.Reservation;
import HotelManagementSystem.ReservationsController;
import HotelManagementSystem.Room;
import HotelManagementSystem.RoomsController;
import HotelManagementSystem.Guest;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author janu
 */
public class HotelManagementSystem {

    private static ArrayList<Room> rooms;
    private static ArrayList<Guest> guests;
    private static ArrayList<Employee> employees;
    private static ArrayList<Reservation> reservations;

    public static void main(String[] args) {
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        employees = new ArrayList<>();
        reservations = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 17) {
            System.out.println("Welcome to Hotel Management System");
            System.out.println("1. Add new room");
            System.out.println("2. Show all rooms");
            System.out.println("3. Edit room data");
            System.out.println("4. Add new guest");
            System.out.println("5. Show all guests");
            System.out.println("6. Search guest by name");
            System.out.println("7. Edit guest data");
            System.out.println("8. Create new reservation");
            System.out.println("9. Show all reservations");
            System.out.println("10. Get reservation by guest name");
            System.out.println("11. Get reservation by guest id");
            System.out.println("12. Edit reservation");
            System.out.println("13. Pay reservation");
            System.out.println("14. Add new Employee");
            System.out.println("15. Show all employees");
            System.out.println("16. Edit employee data");
            System.out.println("17. Quit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    RoomsController.addNewRoom(rooms, scanner);
                    break;
                case 2:
                    RoomsController.showAllRooms(rooms);
                    break;
                case 3:
                    RoomsController.editRoom(rooms, scanner);
                    break;
                case 4:
                    GuestsController.addNewGuest(guests, scanner);
                    break;
                case 5:
                    GuestsController.showAllGuests(guests);
                    break;
                case 6:
                    GuestsController.searchGuestByName(guests, scanner);
                    break;
                case 7:
                    GuestsController.editGuest(guests, scanner);
                    break;
                case 8:
                    ReservationsController.createNewReservation(guests, rooms, reservations, scanner);
                    break;
                case 9:
                    ReservationsController.showAllReservations(reservations, scanner);
                    break;
                case 10:
                    ReservationsController.getReservationbyGuestName(reservations, scanner);
                    break;
                case 11:
                    ReservationsController.getReservationbyGuestId(reservations, scanner);
                    break;
                case 12:
                    ReservationsController.editReservation(guests, rooms, reservations, scanner);
                    break;
                case 13:
                    ReservationsController.payReservation(reservations, scanner);
                    break;
                case 14:
                    EmployeesController.addNewEmployee(employees, scanner);
                    break;
                case 15:
                    EmployeesController.showAllEmployees(employees);
                    break;
                case 16:
                    EmployeesController.editEmployeeData(employees, scanner);
                    break;
                case 17:
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}








class HotelRoom {
    int roomNumber;
    String roomType;
    double pricePerNight;

    // Constructor to initialize values
    HotelRoom(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    // Non-static 
    void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: " + pricePerNight);
    }

    // Static method 
    static void showHotelName() {
        System.out.println("Hotel Name:Hotel Hyatt");
    }

package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("Honda", "Civic", 2011);
    Motorcycle moto = new Motorcycle("BMW", "XM2", 2015);
    @Test
    void carIsVehicleTest() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carWithFourWheelsTest() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motoWithTwoWheelsTest() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carsSpeedTestDriveTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motoSpeedTestDriveTest() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    @Test
    void carParkSpeedTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motoParkSpeedTest() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
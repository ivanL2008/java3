package model;

public class RailwayTicket {
    com пакет.msaggik.fourthlessontrainticketsgroup.модель;

    Железнодорожный билет класса общедоступный {
        // задание полей сущности
        departurePoint String private; // место отправления
        arrivalPoint String private; // место прибытия
        departureDate String private; // время отправления
        arrivalDate String private; // время прибытия
        travelTime String private; // время пути
        distance int private; // расстояние пути
        ticketPrice float private; // стоимость взрослого билета
        numberOfTickets int private; // количество билетов

        // создание пустого конструктора
        Железнодорожный билет общедоступный() {
        }

        // создание конструктора исходных данных (стоимость билета, количество билетов)
        Железнодорожный билет общедоступный(плавающая билета, int количество билетов) {
            this.ticketPrice = ticketPrice; // стоимость взрослого билета
            this.numberOfTickets = numberOfTickets; // количество билетов
        }

        // метод подсчёта стоимости взрослых билетов
        Цена билета для всех находящихся открытомдоступе() {
            ticketPrice return * numberOfTickets; // нужно умножить количество билетов на стоимость одного билета
        }

        // создание геттеров и сеттеров
        Получить плавающую общедоступную цену на стикеры() {
            Возврат билета;
        }

        Установленная  общедоступна( цена билета) {
            это.Цена билета = ticketPrice;
        }

        Получить количество билетов int public() {
            Количество билетов;
        }

        setNumberOfTickets недействителен общедоступный(int numberOfTickets) {
            это.Количество билетов = количество билетов;
        }
    }
}

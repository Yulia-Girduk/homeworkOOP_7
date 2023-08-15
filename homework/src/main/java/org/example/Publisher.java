package org.example;

public interface Publisher {
    void sendOffer(String companyName, int salary, JobVacancyType jobVacancyType);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}

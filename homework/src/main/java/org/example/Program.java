package org.example;

public class Program {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 120000, JobVacancyType.Programmer);
        Company yandex = new Company(jobAgency, "Yandex", 95000, JobVacancyType.Teacher);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000, JobVacancyType.Programmer);
        Company gorStroi = new Company(jobAgency, "GorStroi", 75000, JobVacancyType.Mason);
        Student pertov = new Student("Petrov", JobVacancyType.Programmer);
        Master master = new Master("Ivanov", JobVacancyType.Mason);
        Master sidorov = new Master("Sidorov", JobVacancyType.Teacher);
        Builder romanov = new Builder("Romanov", JobVacancyType.Mason);

        jobAgency.registerObserver(pertov);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(romanov);

        for (int i = 0; i < 1; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            gorStroi.needEmployee();
        }

    }
}

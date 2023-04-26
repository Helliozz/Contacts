package com.example.affirmations.data

import com.example.affirmations.model.Employee


class Datasource{
    fun loadAffirmations(): ArrayList<Employee> {
        return arrayListOf(
            Employee("Brenda Nunez", "158-65-55", true),
            Employee("Ida Myers", "097-40-75"),
            Employee("Elizabeth Smith", "743-89-72"),
            Employee("Robert Taylor", "843-66-90"),
            Employee("Debra Weber", "594-04-91", true),
            Employee("Robin Rodriguez", "899-86-48"),
            Employee("Jose Gibson", "922-80-43"),
            Employee("Ellen Copeland", "975-66-64"),
            Employee("Joshua Blair", "583-07-55", true),
            Employee("Jonathan Wagner", "455-00-35", true),
            Employee("Josephine Garcia", "938-88-42"),
            Employee("Megan Jones", "809-77-18"),
            Employee("Matthew Day", "392-16-18", true),
            Employee("Robert Taylor", "470-25-66"),
            Employee("Gail Walker", "953-79-50"),
            Employee("Donald Rogers", "695-31-46"),

            )
    }
}
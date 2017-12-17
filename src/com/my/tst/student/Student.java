package com.my.tst.student;

/**
 * Created by 607880661 on 17/12/2017.
 */
class Student {

    private String name;
    private String matrixNum;
    private String sports;


    public static class StudentBuilder {
        public String name;
        public String matrixNum;
        public String sports;

        public StudentBuilder buildWithName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder buildWithNum(String matrixNum) {
            this.matrixNum = matrixNum;
            return this;
        }

        public StudentBuilder buildWithSports(String sports) {
            this.sports = sports;
            return this;
        }

        public Student build() {
            return new Student(name, matrixNum, sports);
        }
    }

    private Student(String name, String matrixNum, String sports) {
        this.name = name;
        this.matrixNum = matrixNum;
        this.sports = sports;
    }
}

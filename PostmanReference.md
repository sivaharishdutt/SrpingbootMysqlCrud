I have given the request and response for the api's below
1. Get all students 
api: http://localhost:8081/api/students
method: GET
response: [
    {
        "studentId": 1,
        "studentName": "student one",
        "studentEmail": "student1@gmail.com",
        "studentGrade": "B+",
        "studentAge": 15
    },
    {
        "studentId": 2,
        "studentName": "student two",
        "studentEmail": "student2@gmail.com",
        "studentGrade": "A+",
        "studentAge": 15
    },
    {
        "studentId": 3,
        "studentName": "student three",
        "studentEmail": "student3@gmail.com",
        "studentGrade": "C",
        "studentAge": 16
    },
    {
        "studentId": 4,
        "studentName": "student four",
        "studentEmail": "student4@gmail.com",
        "studentGrade": "B",
        "studentAge": 15
    },
    {
        "studentId": 5,
        "studentName": "student five",
        "studentEmail": "student5@gmail.com",
        "studentGrade": "A+",
        "studentAge": 15
    },
    {
        "studentId": 6,
        "studentName": "student Six Updation",
        "studentEmail": "student6@gmail.com",
        "studentGrade": "D+",
        "studentAge": 15
    },
    {
        "studentId": 52,
        "studentName": "student seven",
        "studentEmail": "student7@gmail.com",
        "studentGrade": "C+",
        "studentAge": 15
    },
    {
        "studentId": 152,
        "studentName": "student eight",
        "studentEmail": "student8@gmail.com",
        "studentGrade": "C",
        "studentAge": 15
    }
]

2. Get student by id
api: http://localhost:8081/api/students/5
method: GET
response: {
        "studentId": 5,
        "studentName": "student five",
        "studentEmail": "student5@gmail.com",
        "studentGrade": "A+",
        "studentAge": 15
    }
    
3. Save student
api: http://localhost:8081/api/students
request body: {
    "studentName": "student eight",
    "studentEmail": "student8@gmail.com",
    "studentAge": 15,
    "studentGrade": "C" 
}
method: POST
response: {
    "studentId": 152,
    "studentName": "student eight",
    "studentEmail": "student8@gmail.com",
    "studentGrade": "C",
    "studentAge": 15
}

4. Update student
api: http://localhost:8081/api/students/152
request body: {
    "studentName": "student eight update",
    "studentEmail": "student88@gmail.com",
    "studentGrade": "C+",
    "studentAge": 15
}
method: PUT
response: {
    "studentId": 152,
    "studentName": "student eight update",
    "studentEmail": "student88@gmail.com",
    "studentGrade": "C+",
    "studentAge": 15
}

5. Delete student
api: http://localhost:8081/api/students/102

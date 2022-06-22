import { Component } from '@angular/core';
import { Employee } from './Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html', //view
  styleUrls: ['./app.component.css'] //style
})
export class AppComponent { //model+logic
  empno: number=7839;
  empname: string='anil';
  job: string='president';
  mgrcode: number=1234;
  hiredate: Date=new Date();
  basicsal: number=15000;
  comm: number=500;
  deptno: number=10;
  title: string = 'sri';

empObj: Employee = new Employee();
empObj2: Employee = new Employee();

navbarOpen=false;
toggleNavbar(){
  this.navbarOpen =! this.navbarOpen;
  console.log('is navbar open>'+this.navbarOpen);
}

empList:Employee[]=
[
{
      "empno" : 1234,
      "empname" : "Smith",
      "maritalstatus" : true,
      "job" : "Manager",
      "mgrcode":7839,
      "hiredate": new Date("Sun Feb 23 2025 11:30:00"),
      "basicsal" : 5300,
      "comm" : 450,
      "deptno" : 10
    },
    { 
      "empno" : 3234,
      "empname" : "Peter",
      "maritalstatus" : true,
      "job" : "Clerk",
      "mgrcode":7839,
      "hiredate": new Date("Sun Feb 20 2026 11:30:00"),
      "basicsal" : 3300,
      "comm" : 340,
      "deptno" : 20
    },
    { 
      "empno" : 7655,
      "empname" : "Adam",
      "maritalstatus" : false,
      "job" : "Salesman",
      "mgrcode":7654,
      "hiredate": new Date("Sun Feb 20 2027 11:30:00"),
      "basicsal" : 3300,
      "comm" : 350,
      "deptno" : 30
    },
    { 
      "empno" : 5634,
      "empname" : "Peter",
      "maritalstatus" : true,
      "job" : "Analyst",
      "mgrcode":7539,
      "hiredate": new Date("Sun Mar 23 2024 11:30:00"),
      "basicsal" : 3300,
      "comm" : 550,
      "deptno" : 30
    },
    { 
      "empno" : 6634,
      "empname" : "Allen",
      "maritalstatus" : false,
      "job" : "Clerk",
      "mgrcode":7435,
      "hiredate": new Date("Sun Apr 23 2025 11:30:00"),
      "basicsal" : 3300,
      "comm" : 450,
      "deptno" : 20
    },
  ]
constructor()
{
  console.log('app component ts cons is invoked.....');
  
  this.empObj.empno=4567;
  this.empObj.empname='rushi';
  this.empObj.job='manager';
  this.empObj.mgrcode=7777;
  this.empObj.hiredate=new Date('2020-12-12 10:00');
  this.empObj.basicsal=25000;
  this.empObj.comm=500;
  this.empObj.deptno=20;

  this.empObj2.empno=1234
  this.empObj2.empname='nidhi';
  this.empObj2.job='salesman';
  this.empObj2.mgrcode=8888;
  this.empObj2.hiredate=new Date('2020-06-12 10:00');
  this.empObj2.basicsal=15000;
  this.empObj2.comm=450;
  this.empObj2.deptno=10;
}
}


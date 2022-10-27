import React, { useState, useEffect } from 'react';
import axios from 'axios';
import EmployeeList from './components/EmployeeList';
import './App.css';
//import client from './components/rest-js';
//import follow from "./follow";

//const root = "/api"

export default function App() {

    const [employees, setEmployees] = useState([]);
//    const [pageSize, setPageSize] = useState(0);
//    let [attributes, setAttributes] = useState([]);
//    let [links, setLinks] = useState([]);


    const getData = async () => {
     const result = await axios.get("/api/employees")
     .catch(err => console.log(err))
     if(result) setEmployees(result.data._embedded.employees);
    }

    useEffect(() => {
       getData()
    }, [])

//  console.log(employees)
  return (
    <div className="App">
     <h1>Hello Spring meet React</h1>
     <EmployeeList employees={employees}/>
    </div>
  );
}

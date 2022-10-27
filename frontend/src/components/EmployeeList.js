import React from 'react';
import Employee from './Employee'

 export default function EmployeeList(props) {

    let employees = [];

    console.log(props.employees)
    if(props.employees[0]){
        employees = props.employees.map((employee,i) => {
            return <Employee key={i} employee={employee} />
        })
    }

    return(
        <div>
            <table>
                <tbody>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Description</th>
                    </tr>
                    {props.employees[0]? employees: null}
                </tbody>
            </table>
        </div>
    )
}
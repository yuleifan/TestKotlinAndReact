import { useState, useEffect } from 'react';
const Fetch = () => {
  const [patients, setPatients] = useState([]);
  useEffect(() => {
    fetch('http://localhost:8080/patient/readAll')
      .then((res) => {
        return res.json();
      })
      .then((data) => {
        console.log(data);
        setPatients(data);
      });
  }, []);
  return (
    <div>

      {patients.map((patient) => (
        <li key={patient.studyId}>{patient.studyId}, {patient.therapeutics},{patient.title}, {patient.status} </li>
      ))}
    </div>
  );
};


export default Fetch;
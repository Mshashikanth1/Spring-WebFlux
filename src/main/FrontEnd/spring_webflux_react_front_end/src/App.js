import logo from './logo.svg';
import React, {useEffect, useState} from 'react';
import myLogo from './64588.jpg';
import './App.css';
import axios from "axios";
import {json} from "react-router-dom";
//import cors from "cors";



function App() {

    //define a state variable to store the api response
    const [apiResponse,setApiResponse]=useState('')

    //make the api call and update the state variable with the reponse.
    useEffect(() =>{
        fetch("http://localhost:8080/random/number/fact")
            .then(response =>response.text())
            .then(data=>setApiResponse(data))
            .catch(error =>console.log(error));
    },[]);


    //call a json api to do that we need to user useState to store data and initiali
    const [apiResponseJson,setApiResponseJson]=useState({})

    //useEffect is used to make the api call and deps are used for when to make call
    useEffect(()=>{
        fetch("http://localhost:8080/number/fact/1..5/10")
            .then(response=>response.json())
            .then(data=>setApiResponseJson(data))
    },[]);

    const[apiResponseHyperLink,setApiResponseHyperLink]=useState('')

    useEffect(()=>{
        fetch("http://localhost:8080/meme")
            .then(res=>res.text())
            .then(data=>setApiResponseHyperLink(data))
        }
        ,[]);



    //  let fetchComments=async ()=>{
    //     const  response=axios("http://localhost:8080/random/number/fact")
    //     setComments(response.data)
    // }


    //
    // const corsOrigin ={
    //     origin:'http://localhost:8080', //or whatever port your frontend is using
    //     credentials:true,
    //     optionSuccessStatus:200
    // }
    // app.use(cors(corsOrigin));

    //
    // let request=new XMLHttpRequest();
    // request.open("GET","http://localhost:8080/random/number/fact");
    // request.setRequestHeader("Access-Control-Allow-Origin" ,"http://localhost:8080");
    // request.setRequestHeader("Access-Control-Allow-Origin", "*")
    // request.setRequestHeader("Access-Control-Allow-Credentials", "true");
    // request.setRequestHeader("Access-Control-Max-Age", "1800");
    // request.setRequestHeader("Access-Control-Allow-Headers", "content-type");
    // request.send();
    // request.onload = () => {
    //     console.log(request);
    //     if (request.status === 200) {
    //         console.log(request.response);
    //     } else {
    //         console.log(`error ${request.status} ${request.statusText}`)
    //     }
    // }

  return (
    <div className="App">
      <header className="App-header">
        <img src={myLogo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <p>
          <h>Hello fun starts from hear!:<br></br>
              <br></br>
              <br></br>
              API THAT RETURN SIMPLE STRING:
              <br></br>
              <div style={{ backgroundColor: 'black', color: 'white', padding: '4px',fontSize: '15px' }}>
                  {apiResponse}
              </div>

              <br></br>
              <br></br>
              API THAT RETURN SIMPLE JSON:
              <div style={{ backgroundColor: 'black', color: 'white', padding: '4px',fontSize: '15px' }}>
                  <pre>{JSON.stringify(apiResponseJson,null,2)}</pre>
              </div>

              <br></br>
              <br></br>
              API THAT RETURN SIMPLE HyperLink:
              <div style={{ backgroundColor: 'black', color: 'white', padding: '4px',fontSize: '15px' }}>
                 <img src={apiResponseHyperLink}/>
              </div>

          </h>

        </p>
      </header>
    </div>
  );
}

export default App;

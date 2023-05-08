import logo from './logo.svg';
import myLogo from './64588.jpg';
import './App.css';
import axios from "axios";


function App() {
  // axios("http://numbersapi.com/random")
  //     .then((result) => setUsers(result.data.data))
  //     .then((json) => {
  //       return json.data;
  //     })
  //     .catch((error) => {
  //       console.error(error);
  //     })
  //     .then((response) => response.parse());



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
          <h>Hello fun starts from hear!


          </h>
        </p>
      </header>
    </div>
  );
}

export default App;

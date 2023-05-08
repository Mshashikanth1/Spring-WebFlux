import axios from 'axios'
const url = 'http://localhost:8080/random/number/fact'
class Facts {
    retrieve(name) {
        return axios.get(`${url}`);

    }
}
export default new Facts()

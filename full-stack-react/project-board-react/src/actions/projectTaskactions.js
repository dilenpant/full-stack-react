import axios from "axios";
import {GET_ERRORS} from "../actions/types"

export const addProjectTask=(project_task,history)=> async dispatch =>{

    try {
        await axios.post("http://localhost:8080/api/proj",project_task);
 history.push("/"); 
        
    } catch (error) {
        
    }
   
}
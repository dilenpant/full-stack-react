import {GET_ERRORS} from "../actions/types";
const initialState ={error:"test errors"};

export default function(state=initialState,action){
switch(action.type){

    case GET_ERRORS:
    return action.paload;

    default:
    return state;
}

}
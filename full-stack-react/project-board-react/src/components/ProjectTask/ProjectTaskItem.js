import React,{Component} from 'react'

 class ProjectTaskItem extends Component{
render(){
   return (
        <div className="card mb-1 bg-light">

        <div className="card-header text-primary">
            ID: projectSequence
        </div>
        <div className="card-body bg-light">
            <h5 class="card-title">summary</h5>
            <p class="card-text text-truncate ">
                acceptanceCriteria
            </p>
            <a href="#" class="btn btn-primary">
                View / Update
            </a>

            <button class="btn btn-danger ml-4">
                Delete
            </button>
        </div>
    </div>

);

    }
 }

 export default ProjectTaskItem;
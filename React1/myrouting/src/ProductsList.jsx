import { useParams } from "react-router-dom";

export function ProductsList(){
    const params =useParams();
    console.log(params.id);
    console.log(params.taskId);
  return <div>PlaceHolder</div>
}
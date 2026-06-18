import {useState,useEffect}from "react";
import { getPost } from "./getPost";
import { PostList } from "./PostList";

export function PostPage(){
    const[isLoading,setLoading]=useState(true);
    const[posts,setPosts]=useState([]);
    useEffect(()=>{
        let cancel = false;
        getPost().then((data)=>{
          if(!cancel){
            setPosts(data);
            setIsLoading(false);
          }
        });
    },[]);
    return <PostList posts ={posts}/>;
}
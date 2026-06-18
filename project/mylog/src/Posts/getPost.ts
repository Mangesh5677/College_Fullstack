import process from "node:process";
/* declare const process: {
    env: {
        REACT_APP_API_URL?: string;
    };
}; */
export async function getPost(){
    const response = await fetch(process.env.REACT_APP_API_URL!);
    const body = (await response.json()) as unknown;
    return body;
}
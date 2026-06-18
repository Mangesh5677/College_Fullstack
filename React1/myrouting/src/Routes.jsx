import { createBrowserRouter, RouterProvider } from "react-router-dom";
import { ProductList } from "./ProductList";
import App from "./App";

const myRouterTree = createBrowserRouter([
  {
    path: "/",
    element: <App />,
  },
  {
    path: "/products",
    element: <ProductList />,
  },
]);

export function Routes() {
  return <RouterProvider router={myRouterTree} />;
}
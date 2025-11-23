import React from 'react';
const CategoryFilter = ({ categories,onSelect }) => {
  return (
    <>
    <select id="categorySelect" className="form-control" onChange={(e) =>onSelect(e.target.value)}>
    <option  key="all" value= ""> All Categories</option>
    {categories.map((category,index) =>(
    <option key={'${category.id}-${index}'} value={category.id}>{category.name}</option>
    


    ))}

    </select>
      
    </>
  );
};

export default CategoryFilter;
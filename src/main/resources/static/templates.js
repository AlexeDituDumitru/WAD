/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function getProductHtml(initialTemplate, product)
{
    var template = initialTemplate;
    var done = false;
    var currentTemplate = template;
    do
    {
        currentTemplate = template;
        template = template.replace("{name}", product.name);
    }while (template !== currentTemplate);
    template = template.replace("{image}", product.image);
    template = template.replace("{description}", product.description);
    template = template.replace("{price}", product.price);
    template = template.replace("{id}", product.id);
    return template;
    
}

function getCategoryItemHtml(initialTemplate, category)
{
    var template = initialTemplate;
    
    template = template.replace("{categoryId}", "" + category.id);
    template = template.replace("{categoryName}", category.name);
    return  template;
}
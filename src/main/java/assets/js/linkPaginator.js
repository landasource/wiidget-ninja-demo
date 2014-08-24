(function($){
    
    $.fn.linkPaginator = function(){
        
        $(this).each(function(){
           
            var $paginator = $(this);
            var $table = $paginator.closest('table');
            
            $('a', $paginator).click(function(e){
                e.preventDefault();
                
                loadWithAjax($(this).attr('href'), $table);
            });            
        });        
    };
    
    function loadWithAjax(url, table){
        
        $.get(url, function(data){
            var content = $('#' + table.attr('id'),$( data ));
            table.replaceWith(content);
            init();
        });
        
    }
    
    var init = function(){
       $('.ajax-link-paginator').linkPaginator();
    };
    $(document).ready(init);
    
})(jQuery);
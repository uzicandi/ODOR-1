/*global */
const ENTER_ACTION = (func) => {
    document.addEventListener('keyup', function(e) {
        switch (e.key) {
            case 'Enter' :
                if (typeof func !== 'function') {
                    return;
                }
                func();
                break;
            default :
                break;
        }
    });

};
const MEMBERSHIP_PAGES = [
    'MyPage',
    'Login',
    'Join',
    'IdPwFinder'
];

// 임시 vuex 저장소
const TMP_SESSION = {
    setLognUser(user = {}) {
        if ('userId' in user) {
            window.loginUser = !SCRIPT_VALIDATOR.nullCheck(user.userId)
                ? {} : user;
        }
    },
    emptyUser() {
        if ('loginUser' in window) {
            delete window.loginUser;
        }
    },
    getId() {
        if ('loginUser' in window) {
            if ('userId' in window.loginUser) {
                return window.loginUser.userId;
            }
            return '';
        }
        return '';
    },
    getLoginUser() {
        if (!SCRIPT_VALIDATOR.nullCheck(this.getId())) {
            return {};
        }
        return window.loginUser;
    }
};
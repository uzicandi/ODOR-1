<template>
    <div>
    <v-snackbar
        v-model="show"
        :right="x === 'right'"
        :top="y === 'top'"
        :color="color"
    >
        {{msg}}
    </v-snackbar>
    </div>
<!--    <div class="overlap">-->
<!--        <v-row justify="center"-->
<!--             v-if="show">-->
<!--            <v-col col="12" md="3">-->
<!--                <v-alert-->
<!--                        :mode="mode"-->
<!--                        :type="status"-->
<!--                        transition="scale-transition"-->
<!--                >-->
<!--                    {{msg}}-->
<!--                </v-alert>-->
<!--            </v-col>-->
<!--        </v-row>-->
<!--    </div>-->
</template>

<script>
    export default {
        name: "RightTopAlert",
        data() {
          return {
              x: 'right',
              y: 'top',
              color: 'cyan darken-2',
              snackbar: false,
          }
        },
        props: {
            // info / success / warning / error
            status: {
                type: String,
                default: 'info',
                required: false
            },
            msg: {
                type: String,
                default: '우측상단Alert',
                required: true
            },
            mode: {
                type: String,
                default: 'out-in',
                required: false
            },
            show: {
                type: Boolean,
                default: false,
                required: false
            },
            showTime: {
                type: Number,
                default: 3000,
                required: false
            },
        },
        watch: {
            show() {
                //this.$emit('hideDisplay');
                setTimeout(() => {
                     this.$emit('hideDisplay');
                }, this.showTime);
            }
        }
    }
</script>

<style scoped>
    /*.overlap {*/
    /*    position: fixed;*/
    /*    z-index: 99;*/
    /*}*/
</style>
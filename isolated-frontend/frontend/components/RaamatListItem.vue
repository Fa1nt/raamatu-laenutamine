<template>
  <div class="raamat-item" :class="{ broneeritud: raamat.broneeritud, laenutatud: raamat.laenutatud }">
    <span>{{ raamat.pealkiri }}</span>
    <div class="controls">
      <span @click="deleteItem">🗑</span>
      <span @click="broneeriItem">Broneeri</span>
      <span @click="laenutaItem">Laenuta</span>
      <input v-model="raamat.kuup2ev" type="date">
    </div>
  </div>
</template>

<script>

export default {
  props: {
    raamat: {
      type: Object,
      default () {
        return {}
      }
    }
  },
  data () {
    return {
      tagastamisKuup2ev: this.raamat.kuup2ev
    }
  },
  methods: {
    broneeriItem () {
      this.raamat.broneeritud = !this.raamat.broneeritud
    },
    laenutaItem () {
      this.raamat.laenutatud = !this.raamat.laenutatud
      if (this.raamat.laenutatud === true) {
        let date = new Date()
        date.setDate(date.getDate() + 28)
        this.raamat.kuup2ev = date.toISOString().split('T')[0]
      } else {
        this.raamat.kuup2ev = null
      }
    },
    deleteItem () {
      this.$emit('delete', this.raamat)
    }
  }
}
</script>

<style lang="scss">
.raamat-item {
  width: 100%;
  display: block;
  height: 50px;
  &.completed {
    opacity: 0.2;
  }
  span {
    height: 50px;
    padding-left: 20px;
    line-height: 50px;
    width: 300px;
    display: inline-block;
  }
  .controls {
    height: 50px;
    line-height: 50px;
    float: right;
    span {
      line-height: 50px;
      height: 50px;
      display: inline-block;
      width: 75px;
      text-align: center;
      padding: 0;
      cursor: pointer;
    }
  }
}
</style>
